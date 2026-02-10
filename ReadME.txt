Project description
	Real-time Chat Application.
	A chat-room that anyone can join, see group messages and send messages to everyone. 

Technologies & Tools
	Development and infrastructure
		- Maven
		- InteliJIdea

	Backend
		- Spring Boot
		- Spring WebSocket
		- Spring Messaging (STOMP protocol)
		- Thymeleaf
		- Lombok

	Frontend
		- HTML/CSS
		- Bootstrap
		- JavaScript (ES6)
		- SockJS
		- STOMP.js


Development steps
    1. Define app functionality
    2. Create SpringBoot project
        - add dependencies
    3. Set up WebSocket configuration
        - create package "config"
        - override registerStompEndpoints
        - override configureMessageBroker
    4. Set up Controller and Model
        - create package "controller"
        - map requests and methods
