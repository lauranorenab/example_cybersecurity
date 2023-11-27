// Java example using Android BiometricPrompt API
BiometricPrompt.PromptInfo promptInfo = new BiometricPrompt.PromptInfo.Builder()
    .setTitle("Authenticate")
    .setSubtitle("Use biometric credentials")
    .setDescription("Place your finger on the sensor")
    .setNegativeButtonText("Cancel")
    .build();

BiometricPrompt biometricPrompt = new BiometricPrompt(context, executor,
    new BiometricPrompt.AuthenticationCallback() {
        @Override
        public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult result) {
            super.onAuthenticationSucceeded(result);
            // Authentication successful
        }
    });

biometricPrompt.authenticate(promptInfo);

