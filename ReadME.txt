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

	Frontend
		- HTML/CSS
		- Bootstrap
		- JavaScript (ES6)
		- SockJS
		- STOMP.js


Development steps
    1. Define app functionality
        - describe main queries APIs
    2. Create SpringBoot project
        - add dependencies
    3. Set up DB
        - create DB
        - add DB params to application.properties
    4. Set up Entities and Repository
        - create new package "repository"
        - define a structure of a task that we art going to have
        - create entities classes
        - create repository interface
    5. Set up Service and Controller
    6. Set up Thymeleaf template
    7. Create tasks functionality
    8. Integrate Bootstrap
