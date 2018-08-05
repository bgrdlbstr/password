@echo off
set /p pass=Enter Pass: 
set /p num1=Enter 1: 
set /p num2=Enter 2: 
set /p num3=Enter 3: 

python password.py %pass% %num1% %num2% %num3%

set /p DUMMY=Hit ENTER to continue...