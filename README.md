# Pendekin.id

pendekin.id, a simple and in-memory URL shortener service, as a CLI (Command-Line interface) app [an app runnable from terminal] that accepts input from the standard output.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

* Java
    ```
    $ java --version
    openjdk 11.0.9.1 2020-11-04
    ```
* Gradle
    ```
    $ gradle -v

    ------------------------------------------------------------
        Gradle 6.3
    ------------------------------------------------------------
    ....
    ```
### Installing

A step by step series of examples that tell you how to get a development env running

1. Clone the repo
    ```
    $ https://github.com/andhikayusup/pendekin
    ```
2. Build pendekin apps
    ```
    $ gradle buildNeeded
    $ gradle jar
    ```
3. Run pendekin apps 
    ```
    $ java -jar build/libs/pendekin.jar
    ```


## Built With

* [Gradle](https://gradle.org/) - Dependency Management


## Authors

* **Andhika Yusup Maulana** 


## Acknowledgments

This repository is developed as completed as a fulfillment to register as a mentorship program in metricsatui.com. The idea and its required feature is credited to them. 