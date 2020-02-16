#!/usr/bin/python
import RPi.GPIO as GPIO
import time

GPIO.setmode(GPIO.BCM)

# init list with pin numbers

pinList = [2]

# loop through pins and set mode and state to 'low'

for i in pinList:
    GPIO.setup(i, GPIO.OUT)
    GPIO.output(i, GPIO.HIGH)

# time to sleep between operations in the main loop

SleepTimeL = 2

# main loop

try:
    for j in pinList:
        GPIO.output(j, GPIO.LOW)
        print("BOOOOMMM!!!")
        time.sleep(SleepTimeL)
    print "Good bye!"
    for k in pinList:
        GPIO.output(k, GPIO.HIGH)

# End program cleanly with keyboard
except KeyboardInterrupt:
    print "  Quit"

    # Reset GPIO settings
    for k in pinList:
        GPIO.output(k, GPIO.HIGH)
    GPIO.cleanup()

# find more information on this script at
# http://youtu.be/oaf_zQcrg7g
