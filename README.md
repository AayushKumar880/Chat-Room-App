# Therawin 📱💬

A real-time, feature-rich **Chat Room Application** built using **Kotlin** and **Jetpack Compose**, integrated with **Firebase Authentication** and **Firestore** for seamless authentication and database operations. The app follows the **MVVM** (Model-View-ViewModel) architecture and provides modern features like AI-powered chat and video calling, making it both engaging and scalable.

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

- [**Kotlin**](https://kotlinlang.org/): The primary language for Android app development, offering null safety and concise code.
- [**Jetpack Compose**](https://developer.android.com/jetpack/compose): A modern toolkit for building native UI.
- [**Firebase Authentication**](https://firebase.google.com/docs/auth): For secure user authentication.
- [**Firebase Firestore**](https://firebase.google.com/docs/firestore): Real-time NoSQL database for storing chat messages and user data.
- [**Navigation Component**](https://developer.android.com/guide/navigation): For handling in-app navigation seamlessly.
- [**Google Gemini API**](https://ai.google.dev/gemini-api): Provides AI chatbot services.
- [**Agora.io API**](https://www.agora.io/en/): For real-time video calling features.

---

## 🚀 APKs for Different Architectures

To ensure compatibility across devices, two APKs are provided for different architectures:
- [`armabi-v7a.apk`](https://github.com/AayushKumar880/Chat-Room-App/releases/download/v1.0/armabi-v7a.apk) (For ARMv7-based devices).
- [`arm64-v8a.apk`](https://github.com/AayushKumar880/Chat-Room-App/releases/download/v1.0/arm64-v8a.apk) (For ARMv8-based devices).

You can download and install the APK based on your device's architecture. Navigate to the `/apks` folder for manual installation.

---

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

- Email: [aayushiitism@gmail.com](mailto:aayushiitism@gmail.com)
- GitHub: [@AayushKumar880](https://github.com/AayushKumar880)

---

## 📝 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
