from django.shortcuts import render, redirect
from django.shortcuts import HttpResponse
from .models import News
from .forms import registroform
from .models import Dataregistro
from django.contrib import messages


def home(resquest):
	context = {
		"text": "jvrbaptista@live.com",
		"nomes": ["jvrbaptista@live.com", "@live.com", "ola", "Oii"]

	}
	return render(resquest, "home.html", context)

def contatos(resquest):
	obj = Dataregistro.objects.get(id=1)
	context = {
		"text": obj
	}
	return render(resquest, "contato.html", context)

def Novidades_detalhes(resquest):
	obj = News.objects.get(id=1)
	context = {
		"object": obj

	}
	return render(resquest, "Novidades_detalhes.html", context)

def Novidades_anual(resquest, year):
	list = News.objects.filter(pub_date__year=year)
	context = {
		'year':year,
		'arquivo_list':list
	}
	return render(resquest, "Novidades_anual.html", context)

def registro(resquest):
	context = {
		"form": registroform

	}
	return render(resquest, "registro.html", context)

def addUser(request):
	form = registroform(request.POST)
	if form.is_valid():
		registro = Dataregistro(Username=form.cleaned_data['username'],
								Password=form.cleaned_data['Password'],
								FistName=form.cleaned_data['FistName'],
								LastName=form.cleaned_data['LastName'],
								Country=form.cleaned_data['Country'],
								State=form.cleaned_data['State'],
								Zip=form.cleaned_data['Zip'],
								Email=form.cleaned_data['email']
								)

		registro.save()
		messages.add_message(request, messages.SUCCESS, "CADASTRO REALIZADO COM SUCESSO !")
		return redirect('addUser')


