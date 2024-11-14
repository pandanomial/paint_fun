 # -----------------------------------------------
 # Exercises: drawing a house
 # ------------------------------------------------
 


from ezgraphics import GraphicsWindow
# pip3 install C:\\User\beaut\Downloads\ezgraphics-2.2.tar.gz

width = 700                   # window width
height = 650                  # window height

win = GraphicsWindow(width, height)
win.setTitle("Python Palace")
canvas = win.canvas()

#canvas.drawPoly(90, 80, 50, 50, 40, 30)
#drawOval(UpLeftRecPointX, UpLeftRecPointY,width, height)
# canvas.setFill("blue")
# colors: RED, YELLOW, BLUE, ORANGE, PINK, CYAN, MAGENTA,ORCHID
# BLACK, WHITE, GRAY, LIGHT GRAY, DARK GRAY DARK BLUE


MID = 150                    # reference x from upper left corner
TOP = 50                     # reference y from upper left corner

canvas.setBackground("pink")                     # sky and background

canvas.setColor("maroon")                        # palace roof largest oval
canvas.drawOval(MID - 140, TOP + 80, 270, 200)
    
canvas.setColor("red")                           # palace eave
canvas.drawRect(MID - 150, TOP + 190, 300, 50)

canvas.setColor("green")                         # grass
canvas.drawRect(MID - 150, TOP + 220, 700, 390)
     
canvas.setColor("orange")
canvas.drawRect(MID - 130, TOP + 220, 230, 220)

canvas.setOutline("black")
canvas.setFill("cyan")
canvas.drawRect(MID - 130, TOP + 220, 32, 220)   # column  left
canvas.drawRect(MID - 30, TOP + 220, 32, 220)    # column  mid
canvas.drawRect(MID + 70, TOP + 220, 32, 220)    # column  right

canvas.setColor("yellow")                        # sun
canvas.drawOval(MID - 150, TOP - 50, 80, 80)

canvas.setOutline("black")
canvas.setFill("magenta")
canvas.drawArc(MID - 90, TOP + 250, 50, 0, 180)   # window
canvas.drawArc(MID + 10, TOP + 250, 50, 0, 180)
canvas.drawRect(MID - 90, TOP + 275, 50, 125)
canvas.drawRect(MID + 10, TOP + 275, 50, 125)

canvas.setColor("magenta")
canvas.drawLine(MID - 90, TOP + 275, MID - 40, TOP + 275)
canvas.drawLine(MID + 10, TOP + 275, MID + 60, TOP + 275)



canvas.setOutline("black")
canvas.setFill("magenta")
canvas.drawLine(MID - 90, TOP + 300, MID - 40, TOP + 300)  # window dividers
canvas.drawLine(MID - 65, TOP + 250, MID - 65, TOP + 400)  # vertical line
canvas.drawLine(MID - 90, TOP + 350, MID - 40, TOP + 350)  # horizontal

canvas.drawLine(MID + 10, TOP + 300, MID + 60, TOP + 300)  # horizontal line
canvas.drawLine(MID + 35, TOP + 250, MID + 35, TOP + 400)  # vertical
canvas.drawLine(MID + 10, TOP + 350, MID + 60, TOP + 350)  # horizontal


canvas.setColor("blue")                                    # stairs top
canvas.drawRect(MID - 190, TOP + 425, 400, 25)

canvas.setColor("dark blue")                               # stairs up mid
canvas.drawRect(MID - 190, TOP + 450, 450, 32)

canvas.setColor(0, 0, 93)  # darker blue 63 is darker than 83
canvas.drawRect(MID - 190, TOP + 482, 500, 35)              # stairs down mid

canvas.setColor(0, 0, 73)  # darker blue 63 is darker than 83
canvas.drawRect(MID - 190, TOP + 517, 550, 35)              # stairs bottom

canvas.setColor("white")                                     # stair banner
# canvas.setTextAnchor("center")
canvas.setTextFont("arial", "bold", 18)
canvas.drawText(MID - 100, TOP + 520, "Python  Palace")


canvas.setColor("dark red")                  # top of roof with 3 dots
canvas.drawOval(MID - 16, TOP, 30, 35)

canvas.setColor("blue")                      # top of roof arc deckoration
canvas.drawOval(MID - 15, TOP - 5, 30, 10)

canvas.setColor("red")                       # lightning rod very top
canvas.drawOval(MID - 10, TOP - 20, 20, 20)

canvas.setColor("yellow")                    # top of roof arc deckoration
canvas.drawOval(MID - 15, TOP - 5, 30, 5)
      

canvas.setColor("maroon")
canvas.drawOval(MID - 35, TOP + 35, 70, 50)    # top of roof 2nd large oval

canvas.setColor("yellow")                      # deck dot left
canvas.drawOval(MID - 15, TOP + 10, 8, 8)
canvas.drawOval(MID - 5, TOP + 10, 8, 8)       # deck dot middle
canvas.drawOval(MID + 5, TOP + 10, 8, 8)       # deck dot right
      

canvas.setColor("white")
canvas.drawOval(MID - 100, TOP + 110, 15, 80)     # roof deck left
canvas.drawOval(MID - 40, TOP + 90, 15, 100)      # roof deck mid left
canvas.drawOval(MID + 20, TOP + 90, 15, 100)      # roof deck mid right
canvas.drawOval(MID + 80, TOP + 110, 15, 80)      # roof deck right


canvas.setColor("pink")
canvas.drawOval(MID + 450, TOP + 400, 40, 35)         # girl's head

canvas.setColor("black")                              # girl eye color
canvas.drawOval(MID + 455, TOP + 400, 10, 10)         # girl left eye
canvas.drawOval(MID + 465, TOP + 410, 10, 10)         # girl right eye

canvas.setColor("yellow")
canvas.drawOval(MID + 490, TOP + 390, 20, 20)         # hair bun

canvas.setColor("black")
canvas.drawArc(MID + 460, TOP + 388, 42, -80, 235)    # hair

canvas.drawOval(MID + 497, TOP + 408, 15, 50)         # hair ponytail


canvas.setColor("yellow")
canvas.drawOval(MID + 455, TOP + 435, 32, 50)         # girl upper torso

canvas.setColor("pink")
canvas.drawOval(MID + 470, TOP + 520, 8, 90)          # girl legs
canvas.drawOval(MID + 480, TOP + 520, 8, 90)


canvas.setColor("yellow")
canvas.drawOval(MID + 430, TOP + 480, 100, 50)        # girl lower torso

canvas.setColor("pink")

canvas.drawOval(MID + 475, TOP + 440, 10, 60)         # girl upperarm
canvas.drawOval(MID + 420, TOP + 490, 60, 8)          # lower arm with flowers

canvas.setColor("orchid")                             # flower
canvas.drawArc(MID + 350, TOP + 410, 160, 100, 80)    # flower holder

canvas.setColor("red")                                # flowers
canvas.drawArc(MID + 350, TOP + 420, 150, 110, 5)
canvas.drawArc(MID + 350, TOP + 420, 150, 140, 5)
canvas.setColor("dark red")
canvas.drawArc(MID + 350, TOP + 420, 150, 130, 5)
canvas.setColor("yellow")
canvas.drawArc(MID + 350, TOP + 420, 150, 160, 5)

canvas.setColor("light green")
canvas.drawArc(MID + 350, TOP + 420, 100, 135, 5)
canvas.setColor("gold")
canvas.drawArc(MID + 350, TOP + 420, 100, 120, 5)

canvas.setColor("light green")
canvas.drawArc(MID + 350, TOP + 420, 160, 153, 5)



canvas.setColor("dark red")                             # flower
canvas.drawOval(MID + 340, TOP + 430, 25, 15)           # dot
canvas.setColor("red")
canvas.drawOval(MID + 365, TOP + 410, 25, 15)           # dot
canvas.drawOval(MID + 335, TOP + 460, 25, 15)           # dot
canvas.setColor("gold")                                 # flower dot
canvas.drawOval(MID + 390, TOP + 430, 25, 15)


canvas.setColor("black")                                # car wheels
canvas.drawOval(MID + 515, TOP + 205, 20, 20)
canvas.drawOval(MID + 485, TOP + 205, 20, 20)

canvas.setColor("light green")                          # car front
canvas.drawRect(MID + 480, TOP + 190, 20, 20)

canvas.setColor("green")
canvas.drawRect(MID + 500, TOP + 170, 40, 40)           # car middle


canvas.setColor("white")                                # clouds
canvas.drawOval(MID + 280, TOP + 10, 40, 35)
canvas.drawOval(MID + 210, TOP + 20, 50, 35)
canvas.drawOval(MID + 250, TOP + 10, 50, 35)
canvas.drawOval(MID + 300, TOP + 20, 80, 60)
canvas.drawOval(MID + 370, TOP + 50, 30, 25)
canvas.drawOval(MID + 390, TOP + 40, 25, 15)


win.wait()  # very important, otherwise it cannot quit
