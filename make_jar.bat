@echo off

cd ./out

del .\org\usvm\api\* /Q
del .\org\jacodb\approximation\annotation\* /Q
rmdir /S /Q .\org

jar -cf ../std-library.jar ./*

pause
