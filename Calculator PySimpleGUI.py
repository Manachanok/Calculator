"""
Manachanok Sirivibulkovit 6001012630101
Reference :: https://pysimplegui.readthedocs.io/en/latest/cookbook/#keypad-touchscreen-entry-input-element-update
blog :: http://manachanok94.blogspot.com
"""

import PySimpleGUI as sg

layout = [
          [sg.Input(size=(45, 1), do_not_clear=True, justification='right', key='input')],
          [sg.Text('Ans :', size=(14, 1), font=('Segoe UI', 13), text_color='gray')],[sg.Text('', size=(14, 1), font=('Segoe UI', 18), text_color='black', key='out')],
          [sg.ReadFormButton('(', button_color=('black', 'white')), sg.ReadFormButton(')', button_color=('black', 'white')), sg.ReadFormButton('del', button_color=('black', 'white')), sg.ReadFormButton('C', button_color=('black', 'white'))],
          [sg.ReadFormButton('7', button_color=('black', 'orange')), sg.ReadFormButton('8', button_color=('black', 'orange')), sg.ReadFormButton('9', button_color=('black', 'orange')), sg.ReadFormButton('/', button_color=('black', 'white'))],
          [sg.ReadFormButton('4', button_color=('black', 'orange')), sg.ReadFormButton('5', button_color=('black', 'orange')), sg.ReadFormButton('6', button_color=('black', 'orange')), sg.ReadFormButton('*', button_color=('black', 'white'))],
          [sg.ReadFormButton('1', button_color=('black', 'orange')), sg.ReadFormButton('2', button_color=('black', 'orange')), sg.ReadFormButton('3', button_color=('black', 'orange')), sg.ReadFormButton('-', button_color=('black', 'white'))],
          [sg.ReadFormButton('.', button_color=('black', 'white')), sg.ReadFormButton('0', button_color=('black', 'orange')), sg.ReadFormButton('=', button_color=('black', 'white')), sg.ReadFormButton('+', button_color=('black', 'white'))],
          ]

form = sg.FlexForm('Calculator', default_button_element_size=(8, 2), auto_size_buttons=False, grab_anywhere=False)
form.Layout(layout)

# Loop forever reading the form's values, updating the Input field
keys_entered = ''
while True:
    button, values = form.Read()  # read the form
    try:
        if button is '=':
            keys_entered = values['input']
            sum = eval(keys_entered)
            form.FindElement('out').Update(sum)
    except ZeroDivisionError:
        form.FindElement('out').Update('Error')
    except SyntaxError:
        form.FindElement('out').Update('Error')
    if button is None:  # if the X button clicked, just exit
          break
    if button is 'C':  # clear keys if clear button
        keys_entered = ''
    elif button is 'del':
        keys_entered = values['input']
        keys_entered = keys_entered[:-1]
    elif button in '()1234567890./*-+':
        keys_entered = values['input']  # get what's been entered so far
        keys_entered += button  # add the new digit
      # output the final string


    form.FindElement('input').Update(keys_entered)  # change the form to reflect current key string


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