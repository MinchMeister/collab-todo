package collab.todo

class Group {

    String name
	String description
	
	@Override String toString() {
		name
	}
	static constraints = {
	}
	static mapping = {
		table 'groups'
	}
}
