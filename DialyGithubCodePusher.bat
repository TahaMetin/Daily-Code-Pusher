@echo off
setlocal
set "source=D:\Projeler\Github\Code-For-Fun-Depo"
set "target=D:\Projeler\Github\Code-For-Fun"
if not exist "%target%\" md "%target%"
for %%F in ("%source%\*.txt") do (
  set "file=%%~nxF"
  move "%%F" "%target%" >nul
  goto :break
)
:break
:: Navigate to the directory you wish to push to GitHub
::Change <path> as needed. Eg. C:\Users\rich\Desktop\Writings
cd D:\Projeler\Github\Code-For-Fun

::Initialize GitHub
git init

::Pull any external changes (maybe you deleted a file from your repo?)
git pull master Code-For-Fun

::Add all files in the directory
git add --all

::Commit all changes with the message "auto push". 
::Change as needed.
git commit -m "auto push"

::Push all changes to GitHub 
git push 
Pause