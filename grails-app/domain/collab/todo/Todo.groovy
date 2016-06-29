package collab.todo

class Todo {

	String name
	String note
	Date dateCreated
	Date dueDate
	Date completedDate
	String priority
	String status
	
	static belongsTo = [group: Group]

    static constraints = {
    	name(blank:false)
		priority(inList:["high", "normal"])
		status(inList:["complete", "in process"])
		note(maxSize:1000, nullable: true)
		completedDate(nullable: true)
		dueDate(nullable: true)
    }
}
