USE [CMSCAFES]
GO
/****** Object:  Table [dbo].[cf_Table]    Script Date: 04/26/2016 21:53:06 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cf_Table](
	[TableId] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
	[TableName] [nvarchar](50) NULL,
	[IsAvailable] [tinyint] NULL,
	[IsDeleted] [bit] NULL,
	[Sitter] [tinyint] NULL,
 CONSTRAINT [PK_cf_Table] PRIMARY KEY CLUSTERED 
(
	[TableId] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[cf_Table] ([TableId], [TableName], [IsAvailable], [IsDeleted], [Sitter]) VALUES (N'ed6290fe-6685-465d-81c4-0131bf098b1e', N'Bàn số 08', 0, 0, 0)
INSERT [dbo].[cf_Table] ([TableId], [TableName], [IsAvailable], [IsDeleted], [Sitter]) VALUES (N'09a277f0-0541-41cc-82e4-08ab350f6008', N'Bàn số 05', 2, 0, 0)
INSERT [dbo].[cf_Table] ([TableId], [TableName], [IsAvailable], [IsDeleted], [Sitter]) VALUES (N'4adb8881-5e65-4796-a286-6f94e10a8fa7', N'Bàn số 07', 0, 0, 0)
INSERT [dbo].[cf_Table] ([TableId], [TableName], [IsAvailable], [IsDeleted], [Sitter]) VALUES (N'96d475e3-d277-4574-ac4f-9fdaf482e336', N'Bàn số 01', 1, 0, 5)
INSERT [dbo].[cf_Table] ([TableId], [TableName], [IsAvailable], [IsDeleted], [Sitter]) VALUES (N'77f8f968-0e91-41a9-9423-c97361300648', N'Bàn số 09', 0, 0, 0)
INSERT [dbo].[cf_Table] ([TableId], [TableName], [IsAvailable], [IsDeleted], [Sitter]) VALUES (N'53269924-4de3-4de2-8658-d266605c2028', N'Bàn số 04', 0, 0, 0)
INSERT [dbo].[cf_Table] ([TableId], [TableName], [IsAvailable], [IsDeleted], [Sitter]) VALUES (N'df07e048-4081-41af-b4a0-e5b3e66f170d', N'Bàn số 03', 0, 0, 0)
INSERT [dbo].[cf_Table] ([TableId], [TableName], [IsAvailable], [IsDeleted], [Sitter]) VALUES (N'34fc5b7f-be08-45f4-b78b-e941d032f035', N'Bàn số 10', 0, 0, 0)
INSERT [dbo].[cf_Table] ([TableId], [TableName], [IsAvailable], [IsDeleted], [Sitter]) VALUES (N'2e445fe3-f8c0-463e-90ab-e96867b1d9a9', N'Bàn số 06', 0, 1, 0)
INSERT [dbo].[cf_Table] ([TableId], [TableName], [IsAvailable], [IsDeleted], [Sitter]) VALUES (N'cd80831a-4db1-476c-9262-fa749906e434', N'Bàn số 02', 2, 0, 0)
/****** Object:  Table [dbo].[cf_Catagory]    Script Date: 04/26/2016 21:53:06 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cf_Catagory](
	[Id] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
	[Name] [nvarchar](50) NULL,
	[IsDeleted] [bit] NULL,
 CONSTRAINT [PK_cf_Catagory] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[cf_Catagory] ([Id], [Name], [IsDeleted]) VALUES (N'af744bb7-391e-4e96-84d5-053a11141b32', N'Các món Đồ Uống', 0)
INSERT [dbo].[cf_Catagory] ([Id], [Name], [IsDeleted]) VALUES (N'6fdbf6f6-c838-4fc5-8096-cf3a89a5830e', N'Các dịch vụ Giải Trí', 0)
INSERT [dbo].[cf_Catagory] ([Id], [Name], [IsDeleted]) VALUES (N'a72f84ca-2654-4be4-a98e-d4fe3f614e47', N'Các món Đồ Ăn', 0)
/****** Object:  Table [dbo].[cf_Food]    Script Date: 04/26/2016 21:53:06 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cf_Food](
	[FoodId] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
	[FoodName] [nvarchar](50) NULL,
	[Units] [nvarchar](50) NULL,
	[Price] [bigint] NULL,
	[CatagoryId] [uniqueidentifier] NULL,
	[IsDeleted] [bit] NULL,
 CONSTRAINT [PK_cf_Food] PRIMARY KEY CLUSTERED 
(
	[FoodId] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'7fb641cb-4fef-485b-a089-2b28ab6512ce', N'Mì tôm chứng gà', N'Bát', 25000, N'a72f84ca-2654-4be4-a98e-d4fe3f614e47', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'df49de5d-5886-4f6d-ae86-2f5d0731143b', N'Cơm rang dưa bò', N'Đĩa', 30000, N'a72f84ca-2654-4be4-a98e-d4fe3f614e47', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'8d9cb12f-48eb-4aa1-9729-3894650966c8', N'Mực tẩm chanh ớt nướng', N'Con', 12000, N'a72f84ca-2654-4be4-a98e-d4fe3f614e47', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'0e6eb959-6fbb-494e-8a57-463ed8beea05', N'Cafe đen đá', N'Cốc', 22000, N'af744bb7-391e-4e96-84d5-053a11141b32', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'377f9d15-a544-424a-a1a2-51637fe3c351', N'Thưởng thức nhạc DJ Hot', N'Giờ', 250000, N'6fdbf6f6-c838-4fc5-8096-cf3a89a5830e', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'ee13c773-50f5-48e7-8f28-6d513418165e', N'Bò kho Bánh Mỳ', N'Đĩa', 25000, N'a72f84ca-2654-4be4-a98e-d4fe3f614e47', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'5bdc3b7f-90b5-407e-81fb-71402f7c0853', N'Cafe Nâu đá', N'Cốc', 20000, N'af744bb7-391e-4e96-84d5-053a11141b32', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'7f02a51f-9092-4dbc-baf6-7743d73a27cc', N'Sữa tươi tiệt trùng Vinamilk', N'Cốc', 30000, N'af744bb7-391e-4e96-84d5-053a11141b32', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'33fc40dc-ff7a-456a-a888-7b83c3928daf', N'Nước Xoài ép nguyên chất', N'Cốc', 35000, N'af744bb7-391e-4e96-84d5-053a11141b32', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'd98ffa5d-9538-4d6a-9f4d-90aec9fc1b6b', N'Bún chả', N'Bát', 25000, N'a72f84ca-2654-4be4-a98e-d4fe3f614e47', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'd9e1ba8d-07d6-4a66-a0e5-972aef49f83e', N'Karaoke', N'Giờ', 200000, N'6fdbf6f6-c838-4fc5-8096-cf3a89a5830e', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'b5b23a41-dc9f-4ae9-8766-9a2a655ca68a', N'Nước dứa ép nguyên chất', N'Cốc', 35000, N'af744bb7-391e-4e96-84d5-053a11141b32', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'd0229573-860b-4d63-bfa0-a39d8331bb05', N'Karaoke massage', N'Giờ', 300000, N'6fdbf6f6-c838-4fc5-8096-cf3a89a5830e', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'090c8102-0228-40d1-948f-b10771676c4d', N'Nước cam ép nguyên chất', N'Cốc', 35000, N'af744bb7-391e-4e96-84d5-053a11141b32', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'2132b656-f132-4a61-85a7-d88efc20cbf0', N'Kem ốc quế', N'Cây', 25000, N'af744bb7-391e-4e96-84d5-053a11141b32', 0)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'0455a22c-07e5-4138-a568-ed3b01f6b923', N'Thịt dê tái chanh', N'Đĩa', 60000, N'a72f84ca-2654-4be4-a98e-d4fe3f614e47', 1)
INSERT [dbo].[cf_Food] ([FoodId], [FoodName], [Units], [Price], [CatagoryId], [IsDeleted]) VALUES (N'6094204e-0b3a-49e6-b8b7-f6478fedeba3', N'Bò bít Tết Huế', N'Đĩa', 15000, N'a72f84ca-2654-4be4-a98e-d4fe3f614e47', 0)
/****** Object:  Table [dbo].[cf_Services]    Script Date: 04/26/2016 21:53:06 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cf_Services](
	[ServiceId] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
	[TableId] [uniqueidentifier] NULL,
	[FoodId] [uniqueidentifier] NULL,
	[Quantity] [tinyint] NULL,
	[Discount] [bigint] NULL,
	[IsPayment] [bit] NULL,
	[Cost] [bigint] NULL,
	[IsDeleted] [bit] NULL,
 CONSTRAINT [PK_cf_Services] PRIMARY KEY CLUSTERED 
(
	[ServiceId] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[cf_Services] ([ServiceId], [TableId], [FoodId], [Quantity], [Discount], [IsPayment], [Cost], [IsDeleted]) VALUES (N'0a16c35a-12ab-4cab-98c8-0c43b7c95647', N'96d475e3-d277-4574-ac4f-9fdaf482e336', N'7fb641cb-4fef-485b-a089-2b28ab6512ce', 2, 10000, 0, 0, 0)
INSERT [dbo].[cf_Services] ([ServiceId], [TableId], [FoodId], [Quantity], [Discount], [IsPayment], [Cost], [IsDeleted]) VALUES (N'c86a64bf-3c0e-4a48-aa54-466983f79953', N'96d475e3-d277-4574-ac4f-9fdaf482e336', N'0e6eb959-6fbb-494e-8a57-463ed8beea05', 2, 0, 0, 0, 0)
INSERT [dbo].[cf_Services] ([ServiceId], [TableId], [FoodId], [Quantity], [Discount], [IsPayment], [Cost], [IsDeleted]) VALUES (N'fb279bc0-d828-4fc1-b427-5d2edde1dbea', N'96d475e3-d277-4574-ac4f-9fdaf482e336', N'8d9cb12f-48eb-4aa1-9729-3894650966c8', 10, 2000, 0, 0, 0)
INSERT [dbo].[cf_Services] ([ServiceId], [TableId], [FoodId], [Quantity], [Discount], [IsPayment], [Cost], [IsDeleted]) VALUES (N'1539943a-90a0-4c83-95ab-6d17efbde9a6', N'77f8f968-0e91-41a9-9423-c97361300648', N'd9e1ba8d-07d6-4a66-a0e5-972aef49f83e', 1, 20000, 1, 10000, 0)
INSERT [dbo].[cf_Services] ([ServiceId], [TableId], [FoodId], [Quantity], [Discount], [IsPayment], [Cost], [IsDeleted]) VALUES (N'70d8aca8-cccb-4858-8006-796d416cb835', N'34fc5b7f-be08-45f4-b78b-e941d032f035', N'0e6eb959-6fbb-494e-8a57-463ed8beea05', 6, 2000, 0, 0, 0)
INSERT [dbo].[cf_Services] ([ServiceId], [TableId], [FoodId], [Quantity], [Discount], [IsPayment], [Cost], [IsDeleted]) VALUES (N'9e85478f-6a28-4f5f-a491-8310233f97b9', N'77f8f968-0e91-41a9-9423-c97361300648', N'7fb641cb-4fef-485b-a089-2b28ab6512ce', 5, 10000, 1, 20000, 0)
INSERT [dbo].[cf_Services] ([ServiceId], [TableId], [FoodId], [Quantity], [Discount], [IsPayment], [Cost], [IsDeleted]) VALUES (N'2dfc4cfa-727e-4d47-b990-9277a09da01e', N'96d475e3-d277-4574-ac4f-9fdaf482e336', N'df49de5d-5886-4f6d-ae86-2f5d0731143b', 2, 5000, 0, 0, 0)
INSERT [dbo].[cf_Services] ([ServiceId], [TableId], [FoodId], [Quantity], [Discount], [IsPayment], [Cost], [IsDeleted]) VALUES (N'fd5771d6-9dc0-46ee-80f2-d742cf653d42', N'77f8f968-0e91-41a9-9423-c97361300648', N'df49de5d-5886-4f6d-ae86-2f5d0731143b', 5, 0, 1, 30000, 0)
INSERT [dbo].[cf_Services] ([ServiceId], [TableId], [FoodId], [Quantity], [Discount], [IsPayment], [Cost], [IsDeleted]) VALUES (N'e47ac3eb-ecd5-4e5f-8cd8-daef42ff5658', N'34fc5b7f-be08-45f4-b78b-e941d032f035', N'7f02a51f-9092-4dbc-baf6-7743d73a27cc', 6, 3000, 0, 0, 0)
INSERT [dbo].[cf_Services] ([ServiceId], [TableId], [FoodId], [Quantity], [Discount], [IsPayment], [Cost], [IsDeleted]) VALUES (N'd158bbe3-9d6c-4af8-bcbd-ec928d48a04e', N'cd80831a-4db1-476c-9262-fa749906e434', N'377f9d15-a544-424a-a1a2-51637fe3c351', 1, 2000, 0, 0, 0)
/****** Object:  StoredProcedure [dbo].[SP_HIENTHI_DANHSACH_DICHVU_BY_TABLEID]    Script Date: 04/26/2016 21:53:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[SP_HIENTHI_DANHSACH_DICHVU_BY_TABLEID]
	@TableId nvarchar(50)
AS
BEGIN
			Select a.ServiceId, a.TableId, a.Quantity, b.TableName, b.IsAvailable 
			From cf_Services a
			Inner Join cf_Table b on a.TableId = b.TableId
			Where a.TableId = @TableId
END
GO
/****** Object:  StoredProcedure [dbo].[SP_HIENTHI_DANHSACH_DICHVU]    Script Date: 04/26/2016 21:53:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[SP_HIENTHI_DANHSACH_DICHVU]	
AS
BEGIN
			Select a.ServiceId, a.TableId, a.Quantity, b.TableName, b.IsAvailable 
			From cf_Services a
			Inner Join cf_Table b on a.TableId = b.TableId
END
GO
/****** Object:  Default [DF_cf_Catagory_Id]    Script Date: 04/26/2016 21:53:06 ******/
ALTER TABLE [dbo].[cf_Catagory] ADD  CONSTRAINT [DF_cf_Catagory_Id]  DEFAULT (newid()) FOR [Id]
GO
/****** Object:  Default [DF_cf_Food_FoodId]    Script Date: 04/26/2016 21:53:06 ******/
ALTER TABLE [dbo].[cf_Food] ADD  CONSTRAINT [DF_cf_Food_FoodId]  DEFAULT (newid()) FOR [FoodId]
GO
/****** Object:  Default [DF_cf_Services_ServiceId]    Script Date: 04/26/2016 21:53:06 ******/
ALTER TABLE [dbo].[cf_Services] ADD  CONSTRAINT [DF_cf_Services_ServiceId]  DEFAULT (newid()) FOR [ServiceId]
GO
/****** Object:  Default [DF_cf_Table_TableId]    Script Date: 04/26/2016 21:53:06 ******/
ALTER TABLE [dbo].[cf_Table] ADD  CONSTRAINT [DF_cf_Table_TableId]  DEFAULT (newid()) FOR [TableId]
GO
/****** Object:  ForeignKey [FK_01]    Script Date: 04/26/2016 21:53:06 ******/
ALTER TABLE [dbo].[cf_Food]  WITH CHECK ADD  CONSTRAINT [FK_01] FOREIGN KEY([CatagoryId])
REFERENCES [dbo].[cf_Catagory] ([Id])
GO
ALTER TABLE [dbo].[cf_Food] CHECK CONSTRAINT [FK_01]
GO
/****** Object:  ForeignKey [FK_02]    Script Date: 04/26/2016 21:53:06 ******/
ALTER TABLE [dbo].[cf_Services]  WITH CHECK ADD  CONSTRAINT [FK_02] FOREIGN KEY([TableId])
REFERENCES [dbo].[cf_Table] ([TableId])
GO
ALTER TABLE [dbo].[cf_Services] CHECK CONSTRAINT [FK_02]
GO
/****** Object:  ForeignKey [FK_03]    Script Date: 04/26/2016 21:53:06 ******/
ALTER TABLE [dbo].[cf_Services]  WITH CHECK ADD  CONSTRAINT [FK_03] FOREIGN KEY([FoodId])
REFERENCES [dbo].[cf_Food] ([FoodId])
GO
ALTER TABLE [dbo].[cf_Services] CHECK CONSTRAINT [FK_03]
GO
