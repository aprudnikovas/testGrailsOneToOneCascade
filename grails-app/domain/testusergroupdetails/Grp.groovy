package testusergroupdetails

class Grp {
	
	String name
	String description
	
	GroupDetails gd
	
    static constraints = {
		gd nullable:true
    }
}
