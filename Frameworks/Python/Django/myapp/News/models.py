from django.db import models
from django.utils import timezone

# Create your models here.

class News(models.Model):
	author = models.CharField(max_length=30)
	title = models.CharField(max_length=30)
	description = models.TextField()
	pub_date = models.DateField(default=timezone.now)


	def __str__(self):
		return self.author


class SportNews(models.Model):
	author = models.CharField(max_length=30)
	title = models.CharField(max_length=30)
	description = models.TextField()

	def __str__(self):
		return self.author


class Dataregistro(models.Model):
	Username = models.CharField(max_length=100)
	Password = models.CharField(max_length=100)
	FistName = models.CharField(max_length=100)
	LastName = models.CharField(max_length=100)
	Country = models.CharField(max_length=100)
	State = models.CharField(max_length=100)
	Zip = models.CharField(max_length=100)
	Email = models.CharField(max_length=100)

	def __str__(self):
		return self.username


