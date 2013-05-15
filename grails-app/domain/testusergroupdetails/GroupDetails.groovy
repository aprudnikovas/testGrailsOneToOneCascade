package testusergroupdetails

class GroupDetails {
	
	Usr usr
	
	static belongsTo = [grp:Grp]
	
    static constraints = {
    }
}
