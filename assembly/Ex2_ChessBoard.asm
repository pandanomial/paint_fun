
Comment !

====================================================================

 
 Chess Board

Write a program that draws an 8 X 8 chess board, with alternating gray
and white squares. You can use the SetTextColor and Gotoxy procedures
from the Irvine32 library. Avoid the use of global variables, and use
declared parameters in all procedures. Use short procedures that are
focused on a single task.
! 


INCLUDE Irvine32.inc

DisplayRow1 PROTO color:BYTE
DisplayRow2 PROTO color:BYTE

SetColor PROTO forecolor:BYTE, backcolor:BYTE
ColorSpace PROTO char:BYTE,forecolor:BYTE, backcolor:BYTE


.data

rows = 8		; draws an 8 X 8 chess board as required
columns = 8		; draws an 8 X 8 chess board as required
divider = 2

.code
main PROC

	; locate cursor at upper left corner
	call Clrscr			
	
	; end of line
	call Crlf			

	; Display the board by loop through to fill color
	; ecx is loop counter
	mov ecx,rows / divider 

LoopTop: 

	; required as alternating gray and white squares
	; gray is required color, odd rows
	INVOKE DisplayRow1, gray

	; end of line
	call Crlf					

	; required as alternating gray and white squares
	; as required color, even rows
	INVOKE DisplayRow2, gray	

	; end of line
	call Crlf		
	
	loop LoopTop
		
	; for system end message color, red background, blue words
	INVOKE SetColor, blue, red
	call Crlf

	exit
main ENDP
;-------------------------------------------------


;------------------------------------------------
; display a single odd row with color
DisplayRow1 PROC uses ecx,
	color:BYTE

	; ecx is loop counter
	mov ecx,columns / 2

LoopTop: 

	; required as alternating gray and white squares
	; color the empty space
	INVOKE ColorSpace, ' ', color,color

	; color the empty space
	INVOKE ColorSpace, ' ', color,color

	; color the empty space
	INVOKE ColorSpace, ' ', white, white

	; color the empty space
	INVOKE ColorSpace, ' ', white, white
	
	loop LoopTop

	ret
DisplayRow1 ENDP
;------------------------------------------------------------


;--------------------------------------------------------------
; display a single even row,  
DisplayRow2 PROC uses ecx,
	color:BYTE

	; ecx is loop counter
	mov ecx,columns / divider

LoopTop: 

	; required as alternating gray and white squares
	INVOKE ColorSpace, ' ', white, white 
	INVOKE ColorSpace, ' ', white, white

	; required as alternating gray and white squares
	INVOKE ColorSpace, ' ', color, color
	INVOKE ColorSpace, ' ', color, color	
	loop LoopTop

	ret
DisplayRow2 ENDP
;---------------------------------------------------


;-------------------------------------------------------
SetColor PROC, forecolor:BYTE, backcolor:BYTE

	movzx eax,backcolor

	; shift left, logical shift, filling lowest bit with 0
	; the highest bit is moved to Carry flag
	; the bit that was in the Carry flag is discarded
	shl eax,4

	add al,forecolor

	call SetTextColor

	ret
SetColor ENDP
;---------------------------------------------------------


;----------------------------------------------------------
; to color the char spaces
ColorSpace PROC USES eax, 
	char:BYTE,forecolor:BYTE, backcolor:BYTE,

	; color the chars
	INVOKE SetColor, forecolor, backcolor
	mov  al,char
	call WriteChar

	ret
ColorSpace ENDP
;-----------------------------------------------------------

END main