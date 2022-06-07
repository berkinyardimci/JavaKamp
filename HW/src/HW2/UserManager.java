package HW2;

	public class UserManager {
		public void add(User user) {
			System.out.println(user.getFirstName() + " " + user.getLastName() +"  Sisteme Kaydedildi");
		}
		public void update(User user) {
			System.out.println(user.getFirstName() + " " + user.getLastName() +"  Güncellendi");
		}
		
			
}
