# Research Assistant (Chrome Extension + Spring Boot Backend)

## Overview
The Research Assistant is a Chrome extension integrated with a Spring Boot backend that leverages the Gemini API to provide summarization and topic suggestions. Users can highlight text on any webpage, activate the extension, and choose between two options:
- **Summarize**: Generates a concise summary of the selected text.
- **Suggest**: Provides further suggestions and related topics based on the selected content.

## Project Structure
```
/research-assistant
│── frontend/              # Chrome Extension Frontend
│   ├── manifest.json      # Chrome Extension Manifest
│   ├── popup.html         # Extension UI
│   ├── popup.css          # Styling for UI
│   ├── popup.js           # JavaScript for handling extension logic
│   ├── background.js      # Background script for managing extension functionality
│
│── backend/               # Spring Boot Backend (Create this folder)
│   ├── src/main/java/...
│   ├── application.properties
│   ├── Controller.java    # API Endpoint
│   ├── Service.java       # Gemini API Interaction
│   ├── MainApplication.java # Spring Boot Main Class
```

## Setup Instructions
### Frontend (Chrome Extension)
1. Open **VS Code**.
2. Navigate to the `frontend/` folder.
3. Save all files.
4. Load the extension into Chrome:
   - Open Chrome and go to `chrome://extensions/`.
   - Enable **Developer mode** (top-right corner).
   - Click **Load unpacked** and select the `frontend/` folder.

### Backend (Spring Boot)
1. **Create a `backend/` folder** (not included in the repository by default).
2. Open **IntelliJ IDEA** or any IDE that supports Spring Boot.
3. Open the `backend/` folder in your IDE.
4. Ensure you have a valid **Gemini API Key** set up:
   - Add `GEMINI_KEY` as an environment variable.
   - Alternatively, set it in `application.properties`:
     ```properties
     gemini.api.key=${GEMINI_KEY}
     ```
5. Run the Spring Boot application.

## How It Works
1. Open any website and select some text.
2. Click on the **Research Assistant** Chrome extension.
3. Choose between:
   - **Summarize**: Generates a summary of the selected text.
   - **Suggest**: Provides related topics and further reading suggestions.
4. The response is fetched via the Spring Boot backend using the Gemini API and displayed in the extension popup.

## Future Enhancements
Feel free to add your own features, such as:
- Additional buttons for different functionalities.
- Improved prompts for better AI responses.
- UI enhancements for a better user experience.

---
This README provides a structured overview of the Research Assistant project, ensuring easy setup and understanding of its workflow.

