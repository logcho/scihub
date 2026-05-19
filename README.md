# scihub

## F1 (Team 1): Faculty RA Interview Scheduling

This repository includes Team 1 documentation for Feature F1: faculty-side RA interview scheduling.

### User Guide (Faculty Workflow)

1. Open your posted RA jobs page.
2. Select a job and open the interview scheduling page:
	- Frontend route: `/rajob/schedule/:jobId`
3. In the **Applicants** tab, click **Schedule** for a student.
4. In the modal, propose up to 3 slots:
	- Slot 1 is required.
	- Slots 2 and 3 are optional.
5. Submit to send the schedule proposal.
6. Use the **Scheduled Interviews** tab to review existing interview entries.
7. Use **Reschedule** or **Cancel** actions when needed.

### Notes

- Current implementation includes the faculty UI flow and interview model/evolution.
- Authorization checks and complete backend interview CRUD APIs are documented as implementation gaps and next steps in the developer docs.

### Developer Documentation

- Feature documentation: [docs/features/f1.md](docs/features/f1.md)

## Local Development Setup

To run the frontend and backend locally, you will need to set up a local MySQL database. 

### Prerequisites

1. **MySQL 8.4**
   Ensure MySQL 8.4 is installed and running on your local machine.

2. **Create the Database**
   Before starting the application, you must manually create the empty database. Play framework will handle creating the tables inside of it. 
   Access your local MySQL server (e.g., `mysql -u root`) and run:
   ```sql
   CREATE DATABASE scihub_db;
   ```

### Configuration Details

The system relies on several configuration settings to connect properly:
1. **Backend Database Connection**
   In `backend/conf/application.conf`, the application is configured to connect to your local MySQL instance:
   ```hocon
   db.default.url="jdbc:mysql://localhost:3306/scihub_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true"
   db.default.username="root"
   db.default.password=""
   ```

2. **Play Evolutions (Automatic Table Generation)**
   In `backend/conf/application.conf`, Play Evolutions is enabled. This ensures that the backend automatically generates the SQL schema based on the Ebean models and applies it to your `scihub_db` database on startup:
   ```hocon
   play.evolutions.enabled=true
   play.evolutions.db.default.enabled=true
   play.evolutions.db.default.autoApply=true
   ```

3. **Frontend to Backend Communication**
   In `frontend/conf/application.conf`, the `backend.rest-host` is mapped to `localhost` (port `9037`) so that the frontend can properly locate and send API requests to the backend server running locally on your Mac.

### Running the Application

1. Open a terminal and start the backend:
   ```bash
   cd backend
   sbt run
   ```
2. Open a second terminal and start the frontend:
   ```bash
   cd frontend
   sbt run
   ```
3. The system should now be fully operational, and you can access the frontend in your browser.