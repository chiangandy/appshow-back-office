import org.apache.shiro.crypto.hash.Sha256Hash
import com.ann.*

class BootStrap {

    def init = { servletContext ->
		
		def adminRole = Role.findByName("管理者")
		if(!adminRole){
			adminRole = new Role(name: "管理者")
			adminRole.addToPermissions("*:*")
			adminRole.save()
		}

		def advRole = Role.findByName("廣告主")
		if(!advRole){
			advRole = new Role(name: "廣告主")
			advRole.addToPermissions("*:*")
			advRole.save()
		}

		def pubRole = Role.findByName("網站主")
		if(!pubRole){
			pubRole = new Role(name: "網站主")
			pubRole.addToPermissions("*:*")
			pubRole.save()
		}

		def AppRole = Role.findByName("手機使用者")
		if(!AppRole){
			AppRole = new Role(name: "手機使用者")
			AppRole.addToPermissions("*:*")
			AppRole.save()
		}
		
		def admin = User.findByUsername('admin')
		if(!admin){
			admin = new User(realname:"網站管理者", username: "admin", passwordHash: new Sha256Hash("admin").toHex(), email:"admin@mooo.com")
			admin.addToRoles(adminRole)
			admin.save()
		}
	}
    def destroy = {
    }
}
