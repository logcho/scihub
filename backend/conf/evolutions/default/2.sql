# --- Migration: Add Interview table for RA Job Interview Scheduling

# --- !Ups

CREATE TABLE interview (
  id                            BIGINT AUTO_INCREMENT NOT NULL,
  rajob_application_id          BIGINT, 
  created_by_user_id            BIGINT, 
  -- using large whole numbers for IDS
  proposed_times                LONGTEXT, -- storing proposed times as JSON string
  chosen_time                   VARCHAR(255),
  status                        VARCHAR(255),
  created_time                  VARCHAR(255),
  updated_time                  VARCHAR(255),
  location                      VARCHAR(255),
  -- additional fields for interview details
  notes                         LONGTEXT,
  CONSTRAINT pk_interview PRIMARY KEY (id),
  CONSTRAINT fk_interview_rajob_application FOREIGN KEY (rajob_application_id) 
    REFERENCES rajob_application(id) ON DELETE CASCADE,
  CONSTRAINT fk_interview_created_by FOREIGN KEY (created_by_user_id) 
    REFERENCES user(id) ON DELETE SET NULL
);
-- Adding indexes for performance optimization
CREATE INDEX idx_interview_rajob_application ON interview(rajob_application_id);
CREATE INDEX idx_interview_created_by ON interview(created_by_user_id);
CREATE INDEX idx_interview_status ON interview(status);

# --- !Downs

DROP TABLE IF EXISTS interview;
-- Note: The interview table will be dropped, which will also remove all interview records.


