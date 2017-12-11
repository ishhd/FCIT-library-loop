
name = raw_input("Hello there , What is your name ? ")

print 'Welcome  ' + name
print ''
print 'Here I gonna play with you a simple game that improve  '
print 'your skills about our Country "Saudi Arabia"'
print ''
print ''
text = ("Saudi Arabia is the biggest Country in middle -----1----- . The Capital city of Saudi Arabia is -----2----- . It's a Country of the Two -----3----- Mosques . -----4----- is The Bride of Red Sea . There are the King Fahad's -----5-----")
blank_space = ['-----1-----' ,'-----2-----' ,'-----3-----' ,'-----4-----' ,'-----5-----']
answer_list = ['east' ,'riyadh' ,'holy' ,'jeddah' ,'fountain']
def exit():
    exit = raw_input("Thank you SO Press enter to exit program. Good bye ")

start = raw_input("Do you wanna start the quize ?: ")
if start=='yes':
    i = 0
    while i < len(blank_space) :
        print text
        print ''
        answers=raw_input("What is the best word you should put it in "+str(blank_space[i])+' ?  ')
        while answers.lower() != answer_list[i]:
            print ''
            print 'oh gosh it is wronge please try again '
            answers = raw_input("What is the best word you should put it in "+str(blank_space[i])+' ?  ')

        if answers.lower() == answer_list[i]:
            print ''
            print 'GREAT !! keep giong '
            text = text.replace(text.find(blank_space[i]),answer_list[i])   
            i += 1
    exit()

else :
    exit()
    
            
        
    