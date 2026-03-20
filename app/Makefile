# Путь к исполняемому файлу
EXECUTABLE_PATH = ./build/install/app/bin/app

.PHONY: run-dist
run-dist:
	./build/install/app/bin/app

.PHONY: build
build:
	./gradlew clean build

.PHONY: build-dist
build-dist:
	./gradlew installDist
