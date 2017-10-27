@echo off
set PATH=C:\Program Files\Git\bin;%PATH%
git pull

git status

:choice
@echo.
@echo 1. Push
@echo 2. Commit
set /p pushOrCommit="Choice: "

if "%pushOrCommit%" == "1" (
	git push
	pause
	exit
)

if not "%pushOrCommit%" == "2" (
@echo Invalid choice
goto choice
)

@echo.
set /p id="Commit Message: "

git add .

set /p confirm="Commit these changes? Y/N: "
@echo.

if "%confirm%" == "y" (
	git commit -m "%id%"
	git push
)
pause