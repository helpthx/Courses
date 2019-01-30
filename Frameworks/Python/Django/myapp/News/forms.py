from django import forms


class registroform(forms.Form):
	Username = forms.CharField(max_length=100,
							   widget=forms.TextInput(attrs={"class":"form-control",
														     "placeholder":"Type your username"}))
	Password = forms.CharField(max_length=100,
							   widget=forms.PasswordInput(attrs={"class": "form-control",
															 "placeholder": "Type your Password"}))
	FistName = forms.CharField(max_length=100,
							   widget=forms.TextInput(attrs={"class":"form-control",
														     "placeholder":"Type your fist name"}))
	LastName = forms.CharField(max_length=100,
							   widget=forms.TextInput(attrs={"class": "form-control",
															 "placeholder": "Type your last name"}))
	Country = forms.CharField(max_length=100,
							   widget=forms.TextInput(attrs={"class": "form-control",
															 "placeholder": "Type your Country"}))
	State = forms.CharField(max_length=100,
							   widget=forms.TextInput(attrs={"class": "form-control",
															 "placeholder": "Type your state"}))
	Zip = forms.CharField(max_length=100,
							widget=forms.TextInput(attrs={"class": "form-control",
														  "placeholder": "Type your ZipCode"}))
	Email = forms.CharField(max_length=100,
							   widget=forms.EmailInput(attrs={"class":"form-control",
														     "placeholder":"Type your Email"}))
