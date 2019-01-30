
# Djando + MySQL + BootStrap

<p align="center">
 
<a href="" alt="">
        <img src="https://img.shields.io/eclipse-marketplace/last-update/notepad4e.svg" /></a>
        
<a href="" alt="">
        <img src="https://img.shields.io/dub/l/vibe-d.svg" /></a>
        
<a href="" alt="">
        <img src="https://img.shields.io/badge/Version-v1-green.svg" /></a>
        
<a href="" alt="">
       <img src="https://img.shields.io/pypi/pyversions/Django.svg" /></a>

  
<a href="" alt="">
       <img src="https://img.shields.io/github/repo-size/badges/shields.svg" /></a>

</p>
<p align="justify">
Simple project integrating django with bootstrap and MySQL database. There are a form which save user inputs in database. This simple project is a base for outhers projects</p>


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

```
Python 3.6.7 
django 2, 1, 2, 'final', 0
bootstrap v4.1.3
pip 9.0.1
```

### Installing

* Install django last stable version
* Install and run MySQL
* Create a database call "django2"
* Set the rigth password and ports on settings.py
* On manage.py ru

```
$ python3 manage.py makemigration
$ python3 manage.py migrate
```


## Running the tests

* Run
```
$ python3 manage.py migrate && python3 manage.py makemigration
```
* Make sure that there are tables from django admin and aplications.
* On /myapp dir run 
```
$ python3 manage.py runserver
```
* Acess the web aplication through:
```
http://127.0.0.1:8000/home/
```
* Note: MySQL server must be online all the aplication's life time.


## Built With

* [Bootstrap](https://getbootstrap.com/) - Bootstrap used
* [Python3](https://www.python.org/download/releases/3.0/) - Main language
* [Django](https://www.djangoproject.com/) - Django API 
* [MySQL](https://www.mysql.com/) - MySQL database

## Authors

* **João Vitor Rodrigues Baptista** - *Initial work* - [helpthx](https://github.com/helpthx)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Based on youtube channel project: [Criando Uma Aplicação Em Django 2.1.2 - Bootstrap - Mysql](https://www.youtube.com/playlist?list=PL2Dw5PtrD32wbOuAufUdr8VRFvuS8sTp5)
 
