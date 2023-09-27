@echo off

cd ./out

jar -cf ../std-library.jar ./generated/* ./stub/* ./runtime/*

cd ..

pause
