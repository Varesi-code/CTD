# Review of User Events & Event handlers.



## Instructions

1. Download the files, or clone the repo on your local machine.
2. Run npm install to get the packages on your local repo.
3. run npm start on your terminal in the folder that holds the files to this project.

### Our Goal for this lesson:

1. We must create the styles for our components. For this project, we will be using React's library Styled Component.
    In case it had not been installed with npm install, then run the command npm install --save styled-components
2. We must be sure that we get the values input by users in the input tags. These values, must be processed in order to avoid errors from the user-end, and then evaluated against the information that we have go stored in our Database, so that we can grant ot deny access.
3. Our Project contains other child-components whose render will depend on the moments of our evaluation process.
   Eg.
   - A loading component should be rendered once the request is being made. It should go away, though, once the request has been fullfiled either positively or negatively.
   - In case of positively, a Success Component should be rendered in our screen to let users know their request has been successful.
   - In case of negatively, an Error component should be rendered in our screen to let users know their request has been resulted in an error.
   
4. We must create all the logic behind the events to be able to move from one component on to another. We must also evaluate whenever props are needed, the type of props, and how to handler any possible propr drilling problem.  

WE'RE GONNA DO GREAT! :)
