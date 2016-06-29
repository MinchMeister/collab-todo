package collab.todo

class TodoController {


    
    def scaffold = true
    
    def search = {
		def todos = Todo.findAllByNameLike("${params.value}%")
		render(view:'search', model: [value: params.value, todos: todos])
	}
	
	def remoteSearch = {
		def todos = Todo.findAllByNameLike("${params.value}%")
		render(template:'results', model: [value: params.value, todos: todos])
	}
}
