#!/bin/bash
Recipient="abiesah@gmail.com"
Subject="Greeting"
Message="Welcome to our site"
mail -s $Subject $Recipient <<< $Message
