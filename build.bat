@echo off

javac --patch-module java.base=actual -d ./out/ @sources.txt
rem javac -d ./out/ @sources.txt

pause
