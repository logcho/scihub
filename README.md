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