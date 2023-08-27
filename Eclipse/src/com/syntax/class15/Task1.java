package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Принять от пользователя имя пользователя, пароль и подтвердить пароль и проверить следующие требования;
		 * Имя пользователя и пароль не могут быть пустыми, если да -> message="Имя пользователя и пароль не могут быть одинаковыми".
		 * Пароль должен состоять минимум из 8 символов, если это так -> message="Пароль слишком короткий".
		 * Пароль не может содержать имя пользователя, если да -> massage="Пароль не может содержать имя пользователя"".
		 * Пароль должен совпадать с подтвержденным паролем, если нет -> message="Пароли не совпадают".
		 * Только после выполнения всех требований -> сообщение "Ваше имя пользователя и пароль были созданы".
		 */
		
		String username="sharif123";
		String password="sharif123wed";
		String confirmPassword="skdfgbk";
		
		
		if(!(username.isEmpty()||password.isEmpty())) {
			
			if(password.length()>=8) {
				if(password.contains(username)) {
					
					if(password.equals(confirmPassword)) {
						System.out.println("Ваше имя пользователя и пароль были созданы");
					}else {
						System.out.println("Пароль не совпадает");
					}
					
				}else {
					System.out.println("Пароль не может содержать имя пользователя");
				}
				
			}else {
				System.out.println("Пароль слишком короткий");
			}
			
		}else {
			System.out.println("Имя пользователя и пароль не могут быть пустыми");
		}

	}

}
