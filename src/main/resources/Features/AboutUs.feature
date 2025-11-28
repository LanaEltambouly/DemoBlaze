Feature: Verify About Us Page Functionality

  Scenario: Verify that About Us video is displayed
    Given user is on About Us page
    When the About Us video loads
    Then the video player should be visible

  Scenario: Verify that user can close About Us video
    Given the About Us video is displayed
    When user clicks on the close button
    Then the About Us modal should close successfully

  Scenario: Verify that video does not play when closed
    Given the About Us video is displayed
    When user clicks on the close button
    Then the video should no longer be visible

  Scenario: Verify video poster is shown before playing
    Given user is on About Us page
    When the About Us video loads
    Then the video poster should be shown

  Scenario: Verify About Us modal opens correctly
    Given user is on About Us page
    When About Us video component appears
    Then About Us modal should be active
