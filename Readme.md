###Steps to add a splash screen:

Reference: [http://docs.phonegap.com/en/2.2.0/cordova_splashscreen_splashscreen.md.html](http://docs.phonegap.com/en/2.2.0/cordova_splashscreen_splashscreen.md.html)

1) Modify res/xml/config.xml to add the following line: `<plugin name="SplashScreen" value="org.apache.cordova.SplashScreen"/>`. Note: If you are creating a new config.xml in your project, make sure to include the contents from config.xml of SalesforceSDK project.

2) Create a new Activity class to override SalesforceDroidGapActivity. Override onCreate and loadUrl methods to initialize splashscreen settings. See SplashScreenDemoActivity for example.

3) Modify onCreate method of your android application class. Specify the new activity (from step 2) in the SalesforceSDKManager.initHybrid() call. See SplashDemoApp class for example.

4) Modify the AndroidManifest.xml to replace SalesforceDroiDGapActivity with the new Activity from step 2.

5) Modify the assets/www/index.html to call navigator.splashscreen.hide() after "deviceready" event is fired. This will hide the splash screen.	