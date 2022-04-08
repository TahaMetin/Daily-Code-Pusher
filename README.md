# Daily Code Pusher
 Daily github code pusher for windows

source  =>  storage for code	

target  =>  git file 

You setup git and give permission from github for this file work.
when this file runs will move 1 file source to target and push changes to github.

You can use this for better looking github pages 	easily . Like every sunday write 7 file and run this command every day. 

For run this file automatically you can use task scheduler in windows or 
create a shortcut of DayChecher.jar and put shortcut in

Windows 7 C:\users\All Users\Start Menu\Programs\Startup(Admin) or User home directory(%userProfile%)

Windows 10 : In Run shell:startup

in it's property -> shortcut -> target - > java.exe -jar D:\..\DayChecher.jar

NOTE: This will run only after you login
