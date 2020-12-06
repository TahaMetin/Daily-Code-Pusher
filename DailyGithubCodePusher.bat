@echo off
setlocal
set "source=D:\Projeler\Github\Code-For-Fun-Depo"
set "target=D:\Projeler\Github\Code-For-Fun"
if not exist "%target%\" md "%target%"
for %%F in ("%source%\*") do (
  set "file=%%~nxF"
  move "%%F" "%target%" >nul
  goto :break
)
:break
:: Navigate to the directory you wish to push to GitHub
::Change D:\Projeler\Github\Code-For-Fun as needed.
cd D:\Projeler\Github\Code-For-Fun

::Initialize GitHub
git init

:: if you don't wanna to delete anything from github delete "git pull" command 
:: change Code-For-Fun as your repostory name
git pull master Code-For-Fun

::Add all files in the directory
git add --all

::Commit all changes with the message "auto push". 
git commit -m "auto push"

::Push all changes to GitHub 
git push 
Pause
