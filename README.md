# Chat Room App

This is a chat room application built using Kotlin and Jetpack Compose. The app uses Firebase Authentication for user sign-up and login, and Firestore for real-time database operations. The architecture follows the MVVM pattern and implements navigation components for seamless user experience.It uses [Google Gemini API](https://ai.google.dev/gemini-api) for AI chatbot and [Agora.io API](https://www.agora.io/en/) for high quality video calling feature.

## Features

- User Sign-Up and Login using Firebase Authentication
- Create and Join Chat Rooms 
- Real-Time Messaging using Firestore
- Navigation using Jetpack Navigation Components
- MVVM Clean Code Architecture
- AI Chatbot
- Video calling

## ScreenShots

![Screenshots of app](https://github.com/AayushKumar880/Chat-Room-App/blob/8b24020ed7c7de5a1ea6f4ca99a8de6426549975/ChatApp%20Snapshots/1.jpg)
![Screenshots 2](https://github.com/AayushKumar880/Chat-Room-App/blob/2381d9c8509561071edc05daa783e27f3b0bec4b/ChatApp%20Snapshots/2.jpg)

## Installation

### Prerequisites

- Recommended [Android Studio Hedgehog | 2023.1.1 Patch 1 January 3, 2024](https://developer.android.com/studio/archive) or higher
- Android device or emulator running API level 24 or higher (Recommended to use UpsideDownCake API 34 x86_64 Android 14.0 system image)
- [Google Gemini API key](https://aistudio.google.com/app/apikey)
- [Agora.io API key](https://www.agora.io/en/)
### Setup

1. Clone the repository:
    ```sh
    git clone https://github.com/AayushKumar880/Chat-Room-App.git
    cd Chat-Room-App
    ```
    Or
   go to File->New->Project from Version Control and copy the link of the project [Link](https://github.com/AayushKumar880/Chat-Room-App.git).

3. Open the project in Android Studio.

4. Set up Firebase:
    - Go to the [Firebase Console](https://console.firebase.google.com/).
    - Create a new project or use an existing one.
    - Add an Android app to your Firebase project.
    - Register the app with your app's package name.
    - Download the `google-services.json` file and place it in the `app` directory of your project.
    - Follow the instructions to add Firebase SDKs to your project.

5. Sync the project with Gradle files.

6. Run the app on your device or emulator.

## Architecture

This app follows the MVVM (Model-View-ViewModel) architecture pattern. Here's a brief overview of the components:

- **Model**: Manages the data and business logic of the app. For this project, Firebase Firestore is used to manage real-time data.
- **View**: Displays the data to the user and handles user interactions. This is built using Jetpack Compose.
- **ViewModel**: Acts as a bridge between the Model and the View. It holds the app's UI data and handles the logic for UI events.

## Libraries Used

- [Kotlin](https://kotlinlang.org/)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Firebase Authentication](https://firebase.google.com/docs/auth)
- [Firebase Firestore](https://firebase.google.com/docs/firestore)
- [Navigation Component](https://developer.android.com/guide/navigation)

## Contributing

Contributions are welcome! Please fork this repository and submit pull requests for any improvements or bug fixes.
.

## Contact

If you have any questions or suggestions, feel free to contact me at aayushiitism@gmail.com.

---

