@echo off

cd ./out

jar -cf ../std-library.jar ./generated/* ./java/* ./runtime/*

cd ..

pause
