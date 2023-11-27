# Python example using the 'pyotp' library for TOTP generation
import pyotp

# Secret key generated during user registration
secret_key = pyotp.random_base32()

# Generate TOTP
totp = pyotp.TOTP(secret_key)
otp = totp.now()

# Verify user input against generated TOTP
if user_input == otp:
    print("Authentication successful")
else:
    print("Authentication failed")
