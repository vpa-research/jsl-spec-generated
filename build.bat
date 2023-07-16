@echo off

rem javac --patch-module java.base=expected  -d ./out/ @sources.txt
javac -d ./out/ @sources.txt

pause
