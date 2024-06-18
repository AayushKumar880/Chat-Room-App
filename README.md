Chat Room App
This is a chat room application built using Kotlin and Jetpack Compose. The app uses Firebase Authentication for user sign-up and login, and Firestore for real-time database operations. 
The architecture follows the MVVM pattern and implements navigation components for seamless user experience.

Features
User Sign-Up and Login using Firebase Authentication
Create and Join Chat Rooms
Real-Time Messaging using Firestore
Navigation using Jetpack Navigation Components
MVVM Architecture

Installation
Prerequisites
Android Studio 4.1 or higher
Android device or emulator running API level 21 or higher
Firebase account
Setup
Clone the repository:

Copy code
git clone https://github.com/AayushKumar880/Chat-Room-App.git
cd Chat-Room-App
Open the project in Android Studio.

Set up Firebase:

Go to the Firebase Console.
Create a new project or use an existing one.
Add an Android app to your Firebase project.
Register the app with your app's package name.
Download the google-services.json file and place it in the app directory of your project.
Follow the instructions to add Firebase SDKs to your project.
Sync the project with Gradle files.

Run the app on your device or emulator.

Architecture
This app follows the MVVM (Model-View-ViewModel) architecture pattern. Here's a brief overview of the components:

Model: Manages the data and business logic of the app. For this project, Firebase Firestore is used to manage real-time data.
View: Displays the data to the user and handles user interactions. This is built using Jetpack Compose.
ViewModel: Acts as a bridge between the Model and the View. It holds the app's UI data and handles the logic for UI events.
Libraries Used
Kotlin
Jetpack Compose
Firebase Authentication
Firebase Firestore
Navigation Component
Contributing
Contributions are welcome! Please fork this repository and submit pull requests for any improvements or bug fixes.

Contact
If you have any questions or suggestions, feel free to contact me at aayushiitism@gmail.com.
