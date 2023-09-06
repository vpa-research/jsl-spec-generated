@echo off

javac --patch-module java.base=expected -d ./out/ @sources.txt
rem javac -d ./out/ @sources.txt

pause
