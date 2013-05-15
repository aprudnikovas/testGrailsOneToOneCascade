package testusergroupdetails

import static org.junit.Assert.*
import org.junit.*

class DeleteTests {
	
	def u,g
	
    @Before
    void setUp() {
		u = new Usr(name:'x').save()
		g = new Grp(name:'name',description:'desc',gd:new GroupDetails(usr:u)).save()
    }
	
	@Test
	void testCanDeleteGroup() {
		
		def gCount = Grp.count()
		def gdCount = GroupDetails.count()
		def uCount = Usr.count()
		
		g.delete(flush:true)
		
		assert Grp.count() == gCount -1
		assert GroupDetails.count() == gdCount -1
		assert Usr.count() == uCount
		
	}
	
}
