#!/usr/bin/env bash

echo -n "Please enter the gpg passphrase: "
read -s passphrase

./mvnw release:perform -Darguments="-Dgpg.passphrase=$passphrase"