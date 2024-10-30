Spring Batch : create robust batch processing system, process high volume of data without human interaction
*example :
we have input csv file contains multiple data in different rows, and we want to insert it into db
without spring batch, we gonna add each row manually
*Spring Batch architecture :
-job launcher : launch spring spring badge job, entry point to initiate jobs, contains method run which will trigger job object (work to be executed in spring batch)
also will call job repository which will tell if our state of job is succed or not (state managamenet)
->job will talk after to another component : step (combination of item reader,item writer,item processor) - job can talk to multiples steps
-item reader will read data from source
-item processor will do processing operations between read and write phases
-item writer will help to save data into destination
