write a spring boot REST apllication which will provided following CRUD operations for "ticket" resource of a telecom compony

1.create new Ticket
2.update ticket details (only status,resolution details,resolution date time can be updated)
3.fetch all open tickets
4.fetch ticket by ID
Ticket has following attributes:
a.ID(unique identifier for each ticket)
b.request registered phone number (unique for each user)
c.category(Enun,example:SIM,CALLING,BROADBAND)
d.Issue details
e.resolution details
f.status(Enum,example:OPEN,IN_PROGRESS,RESOLVED)
g.create date time
h.resolution date time
