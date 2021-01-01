
-- --------------------------------------------------
-- Entity Designer DDL Script for SQL Server 2005, 2008, and Azure
-- --------------------------------------------------
-- Date Created: 12/31/2020 10:45:12
-- Generated from EDMX file: D:\MEAN\JS\13Day\project\MvcApplication1\MvcApplication1\Models\Model1.edmx
-- --------------------------------------------------

SET QUOTED_IDENTIFIER OFF;
GO
USE [MVC_Database];
GO
IF SCHEMA_ID(N'dbo') IS NULL EXECUTE(N'CREATE SCHEMA [dbo]');
GO

-- --------------------------------------------------
-- Dropping existing FOREIGN KEY constraints
-- --------------------------------------------------


-- --------------------------------------------------
-- Dropping existing tables
-- --------------------------------------------------

IF OBJECT_ID(N'[dbo].[Empdemoes]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Empdemoes];
GO

-- --------------------------------------------------
-- Creating all tables
-- --------------------------------------------------

-- Creating table 'Empdemoes'
CREATE TABLE [dbo].[Empdemoes] (
    [code] int IDENTITY(1,1) NOT NULL,
    [name] nvarchar(max)  NULL,
    [gender] nvarchar(max)  NULL,
    [annualSalary] float  NULL,
    [dateOfBirth] nvarchar(max)  NULL
);
GO

-- --------------------------------------------------
-- Creating all PRIMARY KEY constraints
-- --------------------------------------------------

-- Creating primary key on [code] in table 'Empdemoes'
ALTER TABLE [dbo].[Empdemoes]
ADD CONSTRAINT [PK_Empdemoes]
    PRIMARY KEY CLUSTERED ([code] ASC);
GO

-- --------------------------------------------------
-- Creating all FOREIGN KEY constraints
-- --------------------------------------------------

-- --------------------------------------------------
-- Script has ended
-- --------------------------------------------------