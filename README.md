gwtapp
======

My experiment with GWT and GXT frameworks.

This app can be start in SDM.
Run mvn gwt:run-codeserver, launch browser and visit http://localhost:9876/. Copy the buttons to bookmarks.

Then start mvn gwt:run. Copy&Paste url and cut ?gwt.codesvr=127.0.0.1:9997.
Press "Dev Mode On" bookmark.


To generate theme need delete all in \gwtapp\theme\src\main\java.
Set generate profile and run mvn clean install in theme module.


Also, added GXT examples project to test custom theme.