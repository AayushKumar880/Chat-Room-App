# I'm Beside You Prototype 📱💬

A real-time, feature-rich **Therawin App** built using **Kotlin** and **Jetpack Compose**, integrated with **Firebase Authentication** and **Firestore** for seamless authentication and database operations. The app follows the **MVVM** (Model-View-ViewModel) architecture and provides modern features like AI-powered chat and video calling, making it both engaging and scalable.

---

## 🧑‍💻 Developer Information 
#### Aayush Kumar
#### Bachelor of Technology in Mechanical Engineering
#### IIT (ISM) Dhanbad

---

## 🌟 Features
- 🔐 **User Sign-Up and Login**: Securely authenticate users via **Firebase Authentication**.
- 🏠 **Create and Join Chat Rooms**: Interact in multiple chat rooms with friends or new connections.
- 📡 **Real-Time Messaging**: Powered by **Firestore**, enabling instant updates.
- 📍 **Seamless Navigation**: Efficient in-app navigation using **Jetpack Navigation Components**.
- 🎨 **Modern UI**: Built using **Jetpack Compose**, providing a responsive and fluid user experience.
- 🤖 **AI Chatbot**: Powered by **Google Gemini API**, offering intelligent chatbot interactions.
- 📹 **High-Quality Video Calling**: Integrated with **Agora.io API** for real-time video calling.

---

## 🖼️ Screenshots

Take a sneak peek of the app's UI:

![Screenshot 1](https://github.com/AayushKumar880/Chat-Room-App/blob/8b24020ed7c7de5a1ea6f4ca99a8de6426549975/ChatApp%20Snapshots/1.jpg)
![Screenshot 2](https://github.com/AayushKumar880/Chat-Room-App/blob/2381d9c8509561071edc05daa783e27f3b0bec4b/ChatApp%20Snapshots/2.jpg)

---
## 🚀 APKs for Different Architectures

To ensure compatibility across devices, two APKs are provided for different architectures:
- [`armabi-v7a.apk`](https://github.com/AayushKumar880/Therawin-Prototype/blob/83142422adacdd54c97970c5a5a094b64d314eba/Apk/app-armeabi-v7a-debug.apk) (For ARMv7-based devices).
- [`arm64-v8a.apk`](https://github.com/AayushKumar880/Therawin-Prototype/blob/83142422adacdd54c97970c5a5a094b64d314eba/Apk/app-arm64-v8a-debug.apk) (For ARMv8-based devices).

You can download and install the APK based on your device's architecture. Navigate to the `Apk` folder for manual installation.

---

## 🛠️ Installation

### Prerequisites

To get the project running locally, ensure you have the following:
- **Android Studio Hedgehog (2023.1.1 Patch 1 or later)**.
- **Android Device or Emulator** running **API Level 24 or higher** (Recommended: API Level 34, Android 14.0).
- **Google Gemini API Key**: [Sign up here](https://aistudio.google.com/app/apikey).
- **Agora.io API Key**: [Sign up here](https://www.agora.io/en/).

### Setup Instructions

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/AayushKumar880/Chat-Room-App.git
    cd Chat-Room-App
    ```

    Alternatively, open **Android Studio**, go to `File -> New -> Project from Version Control`, and paste the repository link: [Chat Room App GitHub](https://github.com/AayushKumar880/Chat-Room-App.git).

2. **Set Up Firebase**:
    - Navigate to the [Firebase Console](https://console.firebase.google.com/) and create a new project (or use an existing one).
    - Add an Android app to your Firebase project with your app’s package name.
    - Download the `google-services.json` file and place it in the `app` directory.
    - Follow the [Firebase setup instructions](https://firebase.google.com/docs/android/setup) to add Firebase SDKs.

3. **Set Up Google Gemini API**:
    - Get your API key from [Google Gemini API](https://aistudio.google.com/app/apikey) and add it to your project’s `local.properties` and ensure to it as API_KEY.

4. **Set Up Agora.io API**:
    - Obtain your API key from [Agora.io API](https://www.agora.io/en/) and include it in the project’s `local.properties` for enabling video calls and ensure to declare it as apiId.

5. **Sync Gradle Files**:
    - Ensure that all Gradle dependencies are resolved. Go to `File -> Sync Project with Gradle Files` to ensure all libraries are installed.

6. **Run the App**:
    - Select a device or emulator and click on the "Run" button to install and run the app.

---

## 🧩 Architecture Overview

The app follows the **MVVM (Model-View-ViewModel)** architecture pattern to ensure separation of concerns and maintainability.

1. **Model**:
   - Handles all data operations. Firebase Firestore is used for real-time data management and storage.
  
2. **View**:
   - Jetpack Compose is used for building the app's UI, displaying data, and handling user interactions. Compose allows building reactive UI with less boilerplate code.
  
3. **ViewModel**:
   - The ViewModel manages the UI-related data in a lifecycle-conscious way. It acts as a bridge between the Model and the View, ensuring the UI is updated when the data changes without affecting the lifecycle.

---

## 📚 Dependencies and Libraries

This project utilizes a variety of libraries and dependencies to enhance functionality, performance, and maintainability. Below is a detailed description of each dependency, along with the reasons for their selection and advantages over alternatives:

### 1. [Kotlin](https://kotlinlang.org/)
- **Description**: Kotlin is a modern programming language designed to be fully interoperable with Java.
- **Reason for Use**: Kotlin simplifies Android development with concise syntax, null safety, and coroutines for asynchronous programming.
- **Advantages**:
  - **Conciseness**: Reduces boilerplate code significantly compared to Java.
  - **Null Safety**: Helps prevent null pointer exceptions, a common source of runtime crashes.
  - **Coroutines**: Simplifies asynchronous programming, making it easier to handle background tasks.

## FrontEnd Libraries

### 2. [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **Description**: Jetpack Compose is a modern UI toolkit that simplifies UI development on Android.
- **Reason for Use**: It allows for building dynamic user interfaces in a declarative way.
- **Advantages**:
  - **Declarative Syntax**: Makes UI code more readable and easier to maintain.
  - **Less Boilerplate**: Eliminates the need for XML layouts, reducing the overall codebase.
  - **Integration**: Easily integrates with other Jetpack libraries, enhancing modularity.

### 3. [Firebase Authentication](https://firebase.google.com/docs/auth)
- **Description**: A service that provides easy-to-use authentication for applications.
- **Reason for Use**: Firebase Authentication handles user sign-ups, logins, and secure sessions with minimal setup.
- **Advantages**:
  - **Multiple Sign-In Methods**: Supports email/password, social media logins, and more, providing flexibility.
  - **Secure**: Offers built-in security features to protect user data.
  - **Integration with Firestore**: Seamless integration with Firestore for user data management.

### 4. [Firebase Firestore](https://firebase.google.com/docs/firestore)
- **Description**: A NoSQL cloud database that allows for real-time data synchronization.
- **Reason for Use**: Firestore enables efficient data storage and retrieval in real-time, essential for a chat application.
- **Advantages**:
  - **Real-Time Updates**: Automatically synchronizes data across clients, perfect for messaging apps.
  - **Scalability**: Easily handles growing datasets and user loads.
  - **Offline Support**: Provides built-in caching, allowing the app to function without an internet connection.

### 5. [Navigation Component](https://developer.android.com/guide/navigation)
- **Description**: A library for managing app navigation within Android.
- **Reason for Use**: Simplifies the implementation of navigation patterns such as back stack management and deep linking.
- **Advantages**:
  - **Ease of Use**: Provides a simple API for handling navigation actions.
  - **Visual Navigation Graph**: Allows developers to define navigation paths visually, improving clarity.
  - **Safe Args**: Enables type-safe arguments passing between destinations, reducing runtime errors.

## Backend Libraries

### 6. [Google Gemini API](https://ai.google.dev/gemini-api)
- **Description**: An advanced AI service that provides natural language processing capabilities.
- **Reason for Use**: To incorporate AI-driven chat functionalities within the app.
- **Advantages**:
  - **Intelligent Responses**: Provides context-aware responses, enhancing user interaction.
  - **Flexibility**: Can be customized for various conversational scenarios.
  - **State-of-the-Art Technology**: Leverages Google’s cutting-edge AI research for better performance.

### 7. [Agora.io API](https://www.agora.io/en/)
- **Description**: A real-time engagement platform for voice and video calling.
- **Reason for Use**: To facilitate high-quality video calls between users in the chat room.
- **Advantages**:
  - **Low Latency**: Ensures smooth real-time communication, critical for video chats.
  - **Cross-Platform Support**: Works seamlessly across different devices and platforms.
  - **Scalability**: Easily accommodates a growing number of users without compromising quality.

---

By leveraging these libraries and dependencies, Therawin Prototype is built to be robust, scalable, and user-friendly, ensuring an enjoyable experience for all users.


## 🤝 Contributing

We welcome contributions! If you want to contribute to the project, please follow these steps:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add a new feature'`).
4. Push the branch (`git push origin feature-branch`).
5. Open a Pull Request.

We will review your PR and merge it once approved. For any major changes, please open an issue to discuss beforehand.

---

## 🧑‍💻 Contact

For any questions or feedback, feel free to reach out to me:

- Email: [aayushiitism@gmail.com](mailto:aayushiitism@gmail.com) or [22je0012@iitism.ac.in](22je0012@iitism.ac.in)
- GitHub: [@AayushKumar880](https://github.com/AayushKumar880)

---
