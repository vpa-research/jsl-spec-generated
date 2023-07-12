@echo off

cd ./_out

del .\org\usvm\api\* /Q
rmdir /S /Q .\org

jar -cf ../std-library.jar ./*

pause
