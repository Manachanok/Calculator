""" Calculator using pygame """

import pygame
from pygame.locals import *

pygame.init() #Initialize the pygame librsry
pygame.display.init()  #Initialize the display module
pygame.display.get_surface()
size = width, height = (410, 436)
screen = pygame.display.set_mode(size)

# Set colors
gray = (230, 230, 230)
darkgray = (222, 222, 222)
white = (238, 238, 238)
orange = (255, 225, 140)
black = (60, 60, 60)

#Set class'Button' for getting surface is drawn rectangular, color, position and size
class Button():

    def __init__(self, screen, color, x ,y ,w, h):
        self.screen = screen
        self.color = color
        self.x = x
        self.y = y
        self.w = w
        self.h = h

    def color(self, color):
        self.color = color
        return self.Rect()

    def Rect(self):
        return pygame.draw.rect(self.screen, self.color, (self.x, self.y, self.w, self.h))

class Function():
    def __init__(self):
        self.output = []

    def __len__(self):
        if len((self.output)) > 30: #limit len(output) = 30
            self.output = self.output[:-1]
        return len(self.output)

    def is_empty(self):
        return len(self.output) == 0

    def push(self, e):
        self.output.append(e)
        print(self.output)

    def pop(self):
        try:
            self.output = self.output[:-1]
        except IndexError:
            pass

    def remove(self):
        return self.output.clear()

    def sum_list(self):
        return ''.join(self.output)

def Calculator():
    bg = pygame.Surface(screen.get_size())
    bg.convert()
    bg.fill(gray)
    bsize = bwidth, bheight = (100, 60)
    margin = 2

    grid = [[0 for x in range(4)] for y in range(7)]

    # Set font
    font = pygame.font.SysFont("Segoe UI", 22)
    textlist = ['(', ')', 'del', 'C', '7', '8', '9', '/', '4', '5', '6', '*',
                '1', '2', '3', '-', '.', '0', '=', '+']

    O = Function()

    state = False
    while not state:
        pygame.display.set_caption('Calculator')
        screen.blit(bg, (0, 0))
        i = 0
        #Set grid and draw the rectangular
        for row in range(7):
            y = (margin + bheight) * row + margin
            row_click = row
            for column in range(4):
                x = (margin + bwidth) * column + margin
                column_click = column
                if row >= 2:
                    Button(screen, white, x, y, 100, 60).Rect()
                    if grid[row_click][column_click] == 1:
                        Button(screen, orange, x, y, 100, 60).Rect()
                if row > 2 and column <= 2:
                    Button(screen, orange, x, y, 100, 60).Rect()
                    if grid[row_click][column_click] == 1:
                        Button(screen, white, x, y, 100, 60).Rect()
                if row == 6 and column == 0:
                    Button(screen, white, x, y, 100, 60).Rect()
                    if grid[row_click][column_click] == 1:
                        Button(screen, orange, x, y, 100, 60).Rect()
                if row == 6 and column == 2:
                    Button(screen, white, x, y, 100, 60).Rect()
                    if grid[row_click][column_click] == 1:
                        Button(screen, orange, x, y, 100, 60).Rect()

                position = ((margin + bwidth) * column + (bwidth / 2.1), (margin + bheight) * row + (bheight / 3.5))

                if row >= 2:  # Show text on button
                    text = font.render(textlist[i], True, black)
                    screen.blit(text, position)
                    i += 1

                if row == 1 and column == 3:  # Show the output
                    O.__len__()
                    sum = O.sum_list()
                    dis = font.render(sum, True, black)
                    screen.blit(dis, (30, 80))

        for event in pygame.event.get():  # When user do something...
            if event.type == pygame.QUIT:  # If user click for close the window will close
                state = True
                quit()
            if event.type == pygame.MOUSEBUTTONUP:
                pos = pygame.mouse.get_pos()
                column_click = pos[0] // (bwidth + margin)  # Check position
                row_click = pos[1] // (bheight + margin)
                grid[row_click][column_click] = 0
            elif event.type == pygame.MOUSEBUTTONDOWN:  # When user click mouse on button then get variable in list
                pos = pygame.mouse.get_pos()
                column_click = pos[0] // (bwidth + margin)
                row_click = pos[1] // (bheight + margin)
                grid[row_click][column_click] = 1
                if grid[row_click][column_click] == grid[2][0]:
                    O.push('(')
                if grid[row_click][column_click] == grid[2][1]:
                    O.push(')')
                if grid[row_click][column_click] == grid[2][2]:
                    O.pop()
                if grid[row_click][column_click] == grid[2][3]:
                    O.remove()
                if grid[row_click][column_click] == grid[3][0]:
                    O.push('7')
                if grid[row_click][column_click] == grid[3][1]:
                    O.push('8')
                if grid[row_click][column_click] == grid[3][2]:
                    O.push('9')
                if grid[row_click][column_click] == grid[3][3]:
                    O.push('/')
                if grid[row_click][column_click] == grid[4][0]:
                    O.push('4')
                if grid[row_click][column_click] == grid[4][1]:
                    O.push('5')
                if grid[row_click][column_click] == grid[4][2]:
                    O.push('6')
                if grid[row_click][column_click] == grid[4][3]:
                    O.push('*')
                if grid[row_click][column_click] == grid[5][0]:
                    O.push('1')
                if grid[row_click][column_click] == grid[5][1]:
                    O.push('2')
                if grid[row_click][column_click] == grid[5][2]:
                    O.push('3')
                if grid[row_click][column_click] == grid[5][3]:
                    O.push('-')
                if grid[row_click][column_click] == grid[6][0]:
                    O.push('.')
                if grid[row_click][column_click] == grid[6][1]:
                    O.push('0')
                if grid[row_click][column_click] == grid[6][2]:  # If user push button '=', list of variable will sum up
                    try:
                        ans = eval(O.sum_list())
                        O.remove()
                        O.push(str(ans))
                    except ZeroDivisionError:
                        O.remove()
                        O.push('Error')
                    except SyntaxError:
                        O.remove()
                        O.push('Error')
                if grid[row_click][column_click] == grid[6][3]:
                    O.push('+')

            elif event.type == pygame.KEYDOWN:  # Get variable by push the keypad
                if event.key == pygame.K_LEFTPAREN:
                    O.push('(')
                if event.key == pygame.K_RIGHTPAREN:
                    O.push(')')
                if event.key == pygame.K_BACKSPACE:
                    O.pop()
                if event.key == pygame.K_CLEAR:
                    O.remove()
                if event.key == pygame.K_KP7:
                    O.push('7')
                if event.key == pygame.K_KP8:
                    O.push('8')
                if event.key == pygame.K_KP9:
                    O.push('9')
                if event.key == pygame.K_KP_DIVIDE:
                    O.push('/')
                if event.key == pygame.K_KP4:
                    O.push('4')
                if event.key == pygame.K_KP5:
                    O.push('5')
                if event.key == pygame.K_KP6:
                    O.push('6')
                if event.key == pygame.K_KP_MULTIPLY:
                    O.push('*')
                if event.key == pygame.K_KP1:
                    O.push('1')
                if event.key == pygame.K_KP2:
                    O.push('2')
                if event.key == pygame.K_KP3:
                    O.push('3')
                if event.key == pygame.K_KP_MINUS:
                    O.push('-')
                if event.key == pygame.K_KP_PERIOD:
                    O.push('.')
                if event.key == pygame.K_KP0:
                    O.push('0')
                if event.key == pygame.K_KP_ENTER:
                    try:
                        ans = eval(O.sum_list())
                        O.remove()
                        O.push(str(ans))
                    except ZeroDivisionError:
                        O.remove()
                        O.push('Error')
                    except SyntaxError:
                        O.remove()
                        O.push('Error')
                if event.key == pygame.K_KP_PLUS:
                    O.push('+')

            #print(O.output)

        pygame.display.update()  #
        pygame.display.flip()  # If you does not have this code, display will not flip the graphic
    pygame.quit()

Calculator()

"""
::Test Calculator::
16 + 5 * 4 = 36
-3 / 2 + 1 = -0.5
-1 + 1 = 0
1 / 0 = Error
(19 - 94) * = Error
(10 * 3) / (2 - 3) = -30.0
-30 ( = Error
1 + + = Error
+ 3 / 12 = 0.25
5 // 2 = 2
"""
